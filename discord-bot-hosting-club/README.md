# 🚀 Discord Server Creator Bot 🤖

Create your own Pterodactyl server with ease directly from Discord! ✨

## 🌟 Features

*   🎮 **Multiple Server Types**: Choose from a variety of server types including Minecraft, Node.js, TeamSpeak, MySQL Databases, and Python.
*   🔒 **User Authentication**: Secure user registration process with email, username, and password validation.
*   ⚙️ **Automated Server Creation**: Automatically creates users and servers in Pterodactyl.
*   🛡️ **Role Management**: Assigns a specific role to users after server creation.
*   📊 **Server Limits**: Configurable maximum number of servers per user.
*   💬 **Discord Integration**: Seamless integration with Discord commands and buttons.

## 🛠️ Setup

### Prerequisites

*   [Node.js](https://nodejs.org/) installed
*   [npm](https://www.npmjs.com/) or [yarn](https://yarnpkg.com/)
*   A [Pterodactyl](https://pterodactyl.io/) panel instance
*   A [Discord Bot](https://discord.com/developers/applications)

### Installation

1.  Clone the repository:

    ```bash
    git clone https://github.com/DaaanielTV/hosting-club-discord-bot
    cd hosting-club-discord-bot
    ```

2.  Install dependencies:

    ```bash
    npm install # or yarn install
    ```

3.  Configure environment variables:

    *   Create a [.env](http://_vscodecontentref_/0) file based on the `.env.example`
    *   Fill in the required values:

        ```
        # Discord Bot Token
        DISCORD_TOKEN=your_discord_bot_token_here

        # Pterodactyl API Einstellungen
        PTERODACTYL_API_URL=https://your.pterodactyl.domain
        PTERODACTYL_API_KEY=your_pterodactyl_api_key_here

        # Discord Channel ID für Servererstellung
        SERVER_CREATION_CHANNEL_ID=your_specific_channel_id_here

        # Rolle, die nach Servererstellung zugewiesen wird
        SERVER_CREATOR_ROLE_ID=your_role_id_here

        # Maximale Anzahl von Servern pro Benutzer
        MAX_SERVERS_PER_USER=1

        # Pterodactyl Egg IDs für verschiedene Servertypen
        MINECRAFT_EGG_ID=1
        NODEJS_EGG_ID=2
        TEAMSPEAK_EGG_ID=3
        DATABASE_EGG_ID=4
        PYTHON_EGG_ID=5

        # Standort-ID
        LOCATION_ID=1
        ```

### Usage

1.  Start the bot:

    ```bash
    node index.js
    ```

2.  Invite the bot to your Discord server.
3.  Use the `/server create` command in the designated server creation channel.
4.  Follow the prompts to create your server! 🎉

## ⚙️ Configuration

The following settings can be configured via environment variables:

*   [DISCORD_TOKEN](http://_vscodecontentref_/1): Your Discord bot token.
*   [PTERODACTYL_API_URL](http://_vscodecontentref_/2): The URL of your Pterodactyl API.
*   [PTERODACTYL_API_KEY](http://_vscodecontentref_/3): Your Pterodactyl API key.
*   [SERVER_CREATION_CHANNEL_ID](http://_vscodecontentref_/4): The Discord channel ID where server creation commands are allowed.
*   [SERVER_CREATOR_ROLE_ID](http://_vscodecontentref_/5): The Discord role ID to assign after server creation.
*   [MAX_SERVERS_PER_USER](http://_vscodecontentref_/6): The maximum number of servers a user can create.
*   [MINECRAFT_EGG_ID](http://_vscodecontentref_/7): The Pterodactyl Egg ID for Minecraft servers.
*   [NODEJS_EGG_ID](http://_vscodecontentref_/8): The Pterodactyl Egg ID for Node.js servers.
*   [TEAMSPEAK_EGG_ID](http://_vscodecontentref_/9): The Pterodactyl Egg ID for TeamSpeak servers.
*   [DATABASE_EGG_ID](http://_vscodecontentref_/10): The Pterodactyl Egg ID for Database servers.
*   [PYTHON_EGG_ID](http://_vscodecontentref_/11): The Pterodactyl Egg ID for Python servers.
*   [LOCATION_ID](http://_vscodecontentref_/12): The Pterodactyl Location ID to deploy servers to.

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a pull request. 💡

## 📝 License

This project is licensed under the MIT License.

## ❓ Support

For support, please open an issue on GitHub. 🙏