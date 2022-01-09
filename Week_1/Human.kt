//4. Create a new class, Human, includes:
//a. Pass in a mandatory String argument for the name.
//b. Add a method, attack(), that prints "<the name passed in> use Fist Attack!".
//c. In the main() function, create an instance of Human, and call the attack() method to print.

//5. Create a subclass of Human; name it Mage, includes:
//a. Pass in a mandatory String argument for the name, also for the constructor of Human.
//b. Override the attack() method to print "<the name passed in> use Fireball!".
//c. In the main() function, create an instance of Mage, and call the attack() method to print.

//6. Now you have to add a flag to confirm if the Human has mana or not, try to implement and
//print it in the main() function.


open class Human constructor(name:String) {
    private val name = name;
    private var mana = true

    open fun attack() {
        println( "$name use Fist Attack!")
    }

    fun onMana(){
        this.mana = true
    }

    fun offMana(){
        this.mana = false
    }

    fun getManaMessage(){
        if(this.mana){
            println("$name has mana!")
        }
        else{
            println("$name does not have mana!")
        }
    }
}

class Mage(name:String):Human(name){
    private val name = name

    override fun attack(){
        println("$name use Fireball!")
    }
}

fun main() {
    var human = Mage("HuanSU");
    human.onMana()
    human.getManaMessage()
    human.offMana()
    human.getManaMessage()
    human.attack()
}


