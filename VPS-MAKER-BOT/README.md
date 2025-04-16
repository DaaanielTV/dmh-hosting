# VPS Maker Bot

## Manual Installation

Follow these steps to set up your VPS Maker Bot manually:

1. **Install Dependencies**  
    Execute the following command to install the required Python packages:
    ```
    pip install -r requirements.txt
    ```

2. **Create a Dockerfile**  
    Create your Dockerfile:
    ```
    touch Dockerfile
    ```

3. **Build the Docker Image**  
    Build the Docker image with the tag `ubuntu-22.04-with-tmate`:
    ```
    docker build -t ubuntu-22.04-with-tmate .
    ```

4. **Run the Bot**  
    Start the bot by executing:
    ```
    python3 bot.py
    ```
    **Note:** Remember to add your token to the configuration.

*Setup complete!*

## Automated Installation

Update your installation process using the automated script:

- **Using cURL:**
  ```
  bash <(curl -s https://raw.githubusercontent.com/DaaanielTV/dmh-hosting/refs/heads/main/VPS-MAKER-BOT/install.sh)
  ```

- **Using wget:**
  ```
  bash <(wget -qO- https://raw.githubusercontent.com/DaaanielTV/dmh-hosting/refs/heads/main/VPS-MAKER-BOT/install.sh)
  ```

## Features

- **SYSTEMD Integration**
- **Administrative Commands**
- **Real VPS Management:** Automatically handles VPS deployments and optimizes storage usage.
- **Easy Setup Process**
- **Node Auto Deletion:** Automatically deletes nodes when VPS storage is fully utilized.
- **CPU & GPU Crypto Autobanning:** Protects your system by banning unauthorized crypto operations when `anti.sh` is enabled.
- **Additional Commands and Package Integrations Coming Soon!**

## OS Supported Versions

| Version | Status               |
| ------- | -------------------- |
| u22.04  | :white_check_mark:   |
| d12     | :white_check_mark:   |
| u20.04  | :white_check_mark:   |
| d11     | :white_check_mark:   |

## Reporting a Vulnerability

If you discover a vulnerability:
- Please report it promptly.
- Expect an update on the report status.
- Follow the provided guidelines for secure and responsible disclosure.
  
