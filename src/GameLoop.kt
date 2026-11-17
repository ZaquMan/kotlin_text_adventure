fun gameLoop() {
    while (!gameOver) {
        println(roomArray[player.xCoord][player.yCoord].toString())
        print("\n > ")
        val playerInput = readln()

        val playerCommand = playerInput.split(" ")
        when (playerCommand[0].lowercase()) {
            "help" -> drawHelp()
            "move" -> move(playerCommand[1].lowercase())
            "take" -> roomArray[player.xCoord][player.yCoord].
                    takeItem(playerCommand[1].lowercase())
            "drop" -> roomArray[player.xCoord][player.yCoord].
                    dropItem(playerCommand[1].lowercase())
            "search" -> roomArray[player.xCoord][player.yCoord].
                    printSearchText()
            "inventory" -> player.printInventory()
            else -> println("Unknown command. Try HELP.")
        }
    }

    drawEndScreen()
}