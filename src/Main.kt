/* Kotlin Text Adventure
 * By Zach Barnett
 *
 * This project is meant as a quick introduction to Kotlin. As such,
 * it may not strictly adhere to Kotlin's best practices, and is a
 * bit of a mess.  This is not meant as a great game, so there is
 * absolutely room for improvement.
 */

/* Game Rooms
 * [    Prep Room    ]  [    Workspace    ]  [  Storage Room   ]
 * [    Lab Space    ]  [   Entry Hall    ]  [ Security Office ]
 * [    Breakroom    ]  [      Foyer      ]  [  Security Desk  ]
 *                      [     Vehicle     ]
 */

// GLOBAL VARIABLES
var roomArray: MutableList<MutableList<Room>> = mutableListOf()
var player: Player = Player(xCoord = 0, yCoord = 0, inventory = mutableListOf())
var gameOver: Boolean = false

fun main() {
    newGame()
    drawStart()
    gameLoop()
}