/* [0,0] [1,0] [2,0]    [ PR ] [ WS ] [ SR ]
 * [0,1] [1,1] [2,1]    [ LS ] [ EH ] [ SO ]
 * [0,2] [1,2] [2,2]    [ BR ] [ FE ] [ SD ]
 *       [1,3]                 [ Vh ]
 */
fun init_rooms() {
    val col0: MutableList<Room> = mutableListOf()
    val col1: MutableList<Room> = mutableListOf()
    val col2: MutableList<Room> = mutableListOf()

    col0.add(Room(
        name = "Prep Room",
        description = """This room appears to be the area where the staff prepares to 
            enter the lab. There are lockers along the north wall and 
            racks of surgical gowns along the west wall. The staff must 
            not have been to concerned about the research they were 
            doing, as there are no hazmat suits. Good thing you are 
            already wearing one.""".trimMargin(),
        searchText = """There is really only one place to search. You rummage 
            through the lockers. There are some personal items, like 
            deodorant, and a picture of someone's family. Upon further 
            searching""".trimMargin(),
        inventory = mutableListOf("Dave Linfield's Access Badge"),
        exits = mutableListOf("east")
    ))

    col0.add(Room(
        name = "The Lab",
        description = """You've finally reached the laboratory space. So this is 
            where Z1-V0 originated. It looks like a pretty simple lab; 
            there is a small fridge, freezer and incubation unit on the 
            west wall. There is a large window in the east wall over a 
            lab bench. Here there are various test tubes, microscopes, 
            and other analysis equipment. The south wall is taken up by 
            shelving full of assorted reagents.""".trimMargin(),
        searchText = """Whatever happened here, the staff left in a rush. The lab 
            bench has what appears to be an interrupted experiment. Some 
            of the test tube have been knocked over and at least one has 
            shattered on the floor. In their rush to leave, someone has 
            left the incubator partially open, where""".trimMargin(),
        inventory = mutableListOf("Z1-N0 alpha strain sample"),
        exits = mutableListOf("north")
    ))

    col0.add(Room(
        name = "Breakroom",
        description = """The employee break room has seen better days. There is 
            vending machine in the far corner, humming away as if the 
            world hasn't ended. Opposite it, by the door is a water 
            cooler that appears to have leaked all of it's water on the 
            floor, judging by the stain. Sitting in the middle of the 
            room is a table with four chairs haphazardly scattered 
            around it. A withered plant fills the last far corner of the 
            room.""".trimMargin(),
        searchText = """The vending machine contains a lone bag of chips. Too bad 
            you can't reach your wallet through your hazmat 
            suit. You can't remember the last time you found chips of 
             any type. Turning your attention to the table,""".trimMargin(),
        inventory = mutableListOf("Purse Belonging to Nancy Higgins",
            "Lanyard with Albert Mayfield's Access Badge"),
        exits = mutableListOf("east")
    ))

    roomArray.add(col0)

    col1.add(Room(
        name = "Workspace",
        description = """A long desk lines the entire north wall.  A few computers 
            sit evenly spaced along the desk. Each computer has a small 
            collection of personal items, like family photos and a 
            little waving cat statute.""".trimMargin(),
        searchText = """There really only the computers here. Without the passwords, 
            they are useless to you. A closer inspection of the personal 
            items leads you to believe the left computer belonged to 
            Nancy Higgins, but you're not sure about the other two. 
            Rifling around the desk,""".trimMargin(),
        exits = mutableListOf("east", "south", "west")
    ))
    col1.add(Room(
        name = "Entry Hall",
        description = """A large window in the south wall lets you see into the lab 
            space. From here, it is obvious that the staff left in a 
            rush. Opposite the window, you see the CDC missoin statement.""".trimMargin(),
        searchText = """Taking a longer look, you read the mission statement of the 
            CDC. "The CDC serves as the national focus for developing 
            and applying disease prevention and control, environmental 
            health, and health promotion and health education activities 
            designed to improve the health of the people of the United 
            States." You are surprised they put all that on the wall. 
            Other than that,""".trimMargin(),
        exits = mutableListOf("north", "south")
    ))
    col1.add(Room(
        name = "Foyer",
        description = """You've entered the CDC branch office in Wetonka, South 
            Dakota. If it weren't the origin of the Z1-N0 outbreak that 
            has ended life as we know it, you would have never heard of 
            Wetonka. Off you your right, you see a desk labeled 
            "Security". To the left is a break room, and straight ahead 
            is a very sturdy looking door.""".trimMargin(),
        searchText = """There isn't much to note here. You should go to one of the 
            other rooms and search there. Here in the entryway,""".trimMargin(),
        exits = mutableListOf("east", "west", "south")
    ))
    col1.add(Room(
        name = "Utility Van",
        description = """This is the van that you came in. It got you this far and 
            you hope it will get you back to Atlanta where the real 
            scientists can find a cure for the Z1-N0 virus.
        """.trimMargin(),
        searchText = """The scientists in Atlanta have rigged up a min clean room 
            with a fridge in the back of your van. They say that it will 
            let you transport a sample of the Z1-N0 alpha strain without 
            risking catching it yourself. Currently, in your van""".trimMargin(),
        exits = mutableListOf("north")
    ))

    roomArray.add(col1)

    col2.add(Room(
        name = "Storage Room",
        description = """Despite the sign outside the room saying "Storage", there 
            is another desk with two computers along the north wall. The 
            south wall is taken up by filing cabinets and shelves with 
            office supplies, so it sort of fits.""".trimMargin(),
        searchText = """Hanging on the wall next to the left computer is a plaque
            congratulating Dave Linfield for 10 years with the CDC. You 
            notice what looks like a slot for an access card in the 
            east wall. Besides that,""".trimMargin(),
        exits = mutableListOf("west")
    ))
    col2.add(Room(
        name = "Security Office",
        description = """You know this is supposed to be the security office, but it 
            seems like it was originally the janitorial closet and 
            repurposed to also serve as the security office. The east 
            wall has a small desk with a computer and badge printer. The 
            west wall has a floor sink with a mop and bucket in it. The 
            north wall has a shelf of cleaning supplies mixed with log 
            books.""".trimMargin(),
        searchText = """Pushing the mop aside, you find a card reader on the west 
            wall. It looks like it can slot one of the badges from the 
            printer on the other side of the room. Next to the card 
            reader is a sticky note that reads "Insert Al's badge to 
            unlock the door."""".trimMargin(),
        exits = mutableListOf("south")
    ))
    col2.add(Room(
        name = "Security Desk",
        description = """A large, dark, wooden desk fills the room. A sign on the 
            desk reads "All visitors must check-in with security."
            Behind the desk is a clip board with visitor sign-ins, a 
            phone, and a small monitor switching between security 
            cameras from around the building.""".trimMargin(),
        searchText = """Whoever ran security here kept a very clean desk. Taking a 
            closer look at the visitor sign-in, it looks like someone has 
            been practicing their signature. The name Albert Mayfield 
            fills nearly half of the page. Beyond the clip board,""".trimMargin(),
        exits = mutableListOf("north","west")
    ))

    roomArray.add(col2)
}

fun newGame() {
    init_rooms()
    player.xCoord = 1
    player.yCoord = 2
}

fun drawStart() {
    println("""A Kotlin-based Text Adventure
        By Zach Barnett
        
        In a not to distant future, a pandemic has brought the world to 
        it's knees. Commonly known as the "Zombie Virus", Z1-N0 is a 
        virus that causes its victims to enter a state of mindless rage, 
        filled only with a need to attack anyone around them. All it 
        takes is a scratch from one of the "infected" to pass the virus
        on. One of the last hold outs of civilization is in Atlanta, 
        spearheaded by the CDC. It has recently come out that the Z1-N0 
        virus originated at a CDC branch office in rural South Dakota. 
        You've been tasked with entering this office and collecting a 
        sample of the first version of the virus, the alpha strain. The 
        scientists in Atlanta believe that from there, they will be able 
        to develop a harmless version of Z1-N0 that will drive out the 
        current version.
        
        You can MOVE towards any of the exits of a room and TAKE or DROP 
        items listed. Don't forget to SEARCH the rooms. You can also ask 
        for HELP for a reminder of what you can do.""".trimMargin())
    println("\nPress Enter to get started")
    readln()
}

fun drawHelp() {
    println("""You can MOVE, TAKE, DROP, SEARCH, show your INVENTORY, or ask for HELP.
        
        MOVE <direction> - Replace <direction> with north, east, south, 
        or west. If there is an open exit in that direction, you'll move 
        through that exit.
        
        TAKE <item> - Replace <item> with the object in the room you want 
        to pick up. Picking up an item will add it to your inventory. 
        Item names can be shortened to just the first word of the item 
        name.
        
        DROP <item> - Replace <item> with the object in the room you want 
        to drop OR USE. Dropping an item will remove it from your 
        inventory, and in some circumstances, cause things to change.  
        Item names can be shortened to just the first word of the item 
        name.
        
        SEARCH - Search the current room for more details and items of 
        interest.
        
        INVENTORY - Display a list of the items currently in your 
        inventory.
        
        HELP - Show this help page.
    """.trimMargin())
    println("\nPress Enter to get continue")
    readln()
}

fun drawEndScreen() {
    println("""You've collected your sample. Now it's time to get it back to Atlanta.
        Filled with hope that the scientists will be able to find a way 
        to stop the "Zombie Virus," you start the long drive back.
        
        Thank you for playing.
    """.trimMargin())
    println("\nPress Enter to get end")
    readln()
}

fun move (direction: String) {
    if (direction in roomArray[player.xCoord][player.yCoord].exits) {
        when (direction) {
            "north" -> player.yCoord -= 1
            "south" -> player.yCoord += 1
            "east" -> player.xCoord += 1
            "west" -> player.xCoord -= 1
        }
    } else {
        println("That isn't a valid direction")
        println("\nPress Enter to continue")
        readln()
    }
}