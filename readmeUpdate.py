import re
import json

# Define the mapping of old -> new values
mappings = {
    1566: 1455,
    2663: 2591,
    2608: 2520,
    3371: 3099,
    1642: 1518,
    1031: 989,
    1013: 509,
    3429: 3151,
    2232: 2109,
    1241: 1313,
    2624: 2535,
    2542: 2455,
    1329: 1217,
    1630: 1523,
    3018: 2825,
    2414: 2337,
    2640: 2554,
    2164: 2054,
    3427: 3152,
    2692: 2558,
    1894: 1768,
    3555: 3264,
    1570: 1475,
    780: 769,
    783: 700,
    904: 872,
    1063: 1014
}

# Function to update file contents
def update_file(file_path, is_json=False):
    try:
        with open(file_path, 'r') as file:
            content = file.read()

        if is_json:
            # Parse JSON content
            try:
                data = json.loads(content)

                # Recursively replace values in the JSON
                def replace_values(obj):
                    if isinstance(obj, dict):
                        return {key: replace_values(value) for key, value in obj.items()}
                    elif isinstance(obj, list):
                        return [replace_values(item) for item in obj]
                    elif isinstance(obj, int) and obj in mappings:
                        return mappings[obj]
                    else:
                        return obj

                updated_data = replace_values(data)

                # Write updated JSON back to the file
                with open(file_path, 'w') as file:
                    json.dump(updated_data, file, indent=4)

                print(f"Successfully updated JSON file: {file_path}")
            except json.JSONDecodeError as e:
                print(f"Error decoding JSON from {file_path}: {e}")
        else:
            # Replace occurrences of old numbers with new numbers in text files
            pattern = re.compile(r'\\b(' + '|'.join(map(str, mappings.keys())) + r')\\b')
            updated_content = pattern.sub(lambda match: str(mappings[int(match.group(0))]), content)

            # Write updated content back to the file
            with open(file_path, 'w') as file:
                file.write(updated_content)

            print(f"Successfully updated text file: {file_path}")
    except FileNotFoundError:
        print(f"File not found: {file_path}")
    except Exception as e:
        print(f"An error occurred while updating {file_path}: {e}")

# Update the files
update_file('readme.md')
update_file('stats.json', is_json=True)

print("File updates completed!")
