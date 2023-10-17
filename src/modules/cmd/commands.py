import subprocess

command = 'ls'

# Run the command in the command prompt.
try:
    result = subprocess.run(command, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE, text=True)
    print("Command Output:")
    print(result.stdout)
    print("Command Error (if any):")
    print(result.stderr)
except subprocess.CalledProcessError as e:
    print(f"Command failed with error code {e.returncode}")
