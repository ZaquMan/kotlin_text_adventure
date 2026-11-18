/* Player class
 * The Player class is used to keep track of the player's current location
 * and their inventory. Items can be added and removed by manipulating
 * the inventory list. Kotlin seems to favor public class variables, so
 * instead of a private inventory with getters/setters, the inventory is
 * freely accessible.
 */
class Player(var xCoord: Int = 0, var yCoord: Int = 0, var inventory: MutableList<String> = mutableListOf()) {
    fun printInventory() {
        println("I am currently carrying ${inventory.joinToString()}")
        println("\nPress Enter to continue")
        readln()
    }
}

/* Room Class
 * The Room class is the core to the storytelling of the text adventure. A
 * room has a name and description that are displayed when entering, more
 * in-depth details in the searchText, unlocked exits, inventory items,
 * and importantly, a function to handle items dropped. This function is
 * called when ever a player drops (uses) an item in the room to determine
 * what happens beyond adding the item to the room's inventory.
 */

class Room(val name: String = "Unremarkable Room",
           val description: String = "It's a room. There isn't anything to set it apart from another room.",
           var searchText: String = "You don't see anything noteworthy about the room and",
           var inventory: MutableList<String> = mutableListOf(),
           var exits: MutableList<String> = mutableListOf(),

) {
    override fun toString(): String {
        return """
            $name
            -------------------------------------------------------------
            $description
            
            ${printExits()}
        """.trimMargin()
    }

    fun printInventory(): String {
        return when (inventory.size) {
            0 -> "there are no items worth grabbing."
            1 -> "there is a ${inventory[0]} that looks interesting."
            else -> "there are a ${inventory.joinToString()}."
        }
    }

    fun printExits(): String {
        return when (exits.size) {
            0 -> "There are no exits...Did you lock yourself in?"
            1 -> "There is an exit to the ${exits[0]}."
            else -> "There are exits to the ${exits.joinToString()}." //for exit -1, ", and "
        }
    }

    fun printSearchText() {
        println(
            """
            $name
            ---------------------------------------
            $searchText ${printInventory()}
        """.trimMargin()
        )
        println("\nPress Enter to continue")
        readln()
    }

    fun dropItem(item: String) {
        inventory.add(item)
        player.inventory.remove(item)
        when (item) {
            "z1-n0" -> {
                gameOver = true
                println("You secure the $item in the fridge in the back of your van. You can now get out of here!")
            }

            "dave" -> {
                println("You place the access badge in the reader and it lets out a soft beep. From the west, you hear a door buzz.")
                roomArray[0][0].exits.add("south")
            }

            "lanyard" -> {
                println(
                    """You place the access badge in the reader and 
                    it lets out a soft beep. From the other side of the 
                    wall, you hear a door buzz.""".trimMargin(),
                )
                roomArray[1][2].exits.add("north")
            }

            else -> println("You drop the $item in the room.")
        }
    }

    fun takeItem(item: String) {
        inventory.remove(item)
        player.inventory.add(item)
        when (item) {
            "dave" -> {
                println("You remove the access badge from the reader.")
                roomArray[0][0].exits.remove("south")
            }

            "lanyard" -> {
                println("You remove the access badge from the reader.")
                roomArray[1][2].exits.remove("north")
            }

            else -> println("You take the $item.")
        }
    }
}