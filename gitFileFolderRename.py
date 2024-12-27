import os

# Define your mapping of incorrect -> correct question numbers
mappings = {
    1566: 1455, 2663: 2591, 2608: 2520, 3371: 3099,
    1642: 1518, 1031: 989, 1013: 509, 3429: 3151,
    2232: 2109, 1241: 1313, 2624: 2535, 2542: 2455,
    1329: 1217, 1630: 1523, 3018: 2825, 2414: 2337,
    2640: 2554, 2164: 2054, 3427: 3152, 2692: 2558,
    1894: 1768, 3555: 3264, 1570: 1475, 780: 769,
    783: 700, 904: 872, 1063: 1014
}

# Directory containing the files and folders
base_directory = r'D:\Leetcode'

def rename_files_and_folders_and_update_readme(base_dir, mapping):
    for foldername in os.listdir(base_dir):
        folder_path = os.path.join(base_dir, foldername)
        new_foldername = foldername
        
        # Step 1: Rename folder if it matches a mapping
        for old_number, new_number in mapping.items():
            old_prefix = f"{old_number}-"
            if foldername.startswith(old_prefix):
                # Build the new folder name
                new_prefix = f"{new_number}-"
                new_foldername = foldername.replace(old_prefix, new_prefix, 1)
                
                # Rename the folder
                new_folder_path = os.path.join(base_dir, new_foldername)
                os.rename(folder_path, new_folder_path)
                folder_path = new_folder_path  # Update folder path to renamed one
                print(f"Renamed folder: {foldername} -> {new_foldername}")
                break
        
        # Step 2: Rename files inside the folder
        if os.path.isdir(folder_path):
            for filename in os.listdir(folder_path):
                old_file_path = os.path.join(folder_path, filename)
                new_filename = filename
                for old_number, new_number in mapping.items():
                    old_prefix = f"{old_number}-"
                    if filename.startswith(old_prefix):
                        # Build the new file name
                        new_prefix = f"{new_number}-"
                        new_filename = filename.replace(old_prefix, new_prefix, 1)
                        
                        # Rename the file
                        new_file_path = os.path.join(folder_path, new_filename)
                        os.rename(old_file_path, new_file_path)
                        print(f"Renamed file: {filename} -> {new_filename}")
                        break
            
            # Step 3: Update the README.md file
            readme_path = os.path.join(folder_path, 'README.md')
            if os.path.exists(readme_path):
                print(f"Updating README.md in folder: {new_foldername}")
                with open(readme_path, 'r', encoding='utf-8') as file:
                    content = file.read()
                
                # Replace old problem numbers with new ones
                for old_number, new_number in mapping.items():
                    content = content.replace(str(old_number), str(new_number))
                
                # Write updated content back to README.md
                with open(readme_path, 'w', encoding='utf-8') as file:
                    file.write(content)
                print(f"Updated README.md in folder: {new_foldername}")

rename_files_and_folders_and_update_readme(base_directory, mappings)
