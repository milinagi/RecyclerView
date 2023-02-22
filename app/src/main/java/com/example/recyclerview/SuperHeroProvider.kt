package com.example.recyclerview

class SuperHeroProvider {
    companion object {
        val superHeroList = listOf<SuperHero>(
            SuperHero(
                "KotlinMan",
                "Jetbrains",
                "Jorge",
                "https://cursokotlin.com/wp-content/uploads/2020/09/Webp.net-compress-image-300x300.jpg"
            ),
            SuperHero(
                "Spiderman",
                "Marvel",
                "Peter Parker",
                "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"
            ),
            SuperHero(
                "Daredevil",
                "Marvel",
                "Matthew Michael Murdock",
                "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"
            ),
            SuperHero(
                "Wolverine",
                "Marvel",
                "James Howlett",
                "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"
            ),
            SuperHero(
                "Green Lanter",
                "DC",
                "Alan Scott",
                "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"
            ),
            SuperHero(
                "Wonder Woman",
                "DC",
                "Princess Diana",
                "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"
            )
        )

    }
}