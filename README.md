# Overview

This text-adventure o\is my foray into the Kotlin programming language.
Ultimately, I want to explore developing applications for Android.
While this project is a game, and I could use a game engine like Unity
to develop an app, I wanted the knowledge to build the apps without an
engine.
Kotlin is where I've chosen to start.

This program makes use of various syntaxes that are unique to Kotlin, 
or implemented differently in Kotlin. An example of this is the WHEN 
keyword to handle switching cases. It is more elegant than a long list
of if..else if..else blocks and makes the code easier to understand.

I initially chose to write a text-adventure, as opposed to a digital
journal, or some other form of information manager, because I've been
guided through creating a similar text-adventure using C#, so I thought
it would give me a head start. While I ultimately followed some of the
design concepts, this project is 100% original code.

{Provide a link to your YouTube demonstration. It should be a 4-5 minute demo of the software running and a walkthrough of the code. Focus should be on sharing what you learned about the language syntax.}

[Software Demo Video](http://youtube.link.goes.here)

# Development Environment

This was developed using JetBrains' IntelliJ IDEA 2026.2.5 IDE.
This uses Kotlin v2.4.21 on top of the Oracle Java 27.0.1 SDK.


# Useful Websites

- [Kotlin Documentation](https://kotlinlang.org/docs)
- [Stack Overflow](https://stackoverflow.com)

# Future Work

- Make items individual data classes, giving them descriptions, and 
moving their interactions into the object instead of a list in the
Room class
- Add additional actions, like using items without needing to drop
them
- Clean up console outputs, possibly writing a unified output parser
