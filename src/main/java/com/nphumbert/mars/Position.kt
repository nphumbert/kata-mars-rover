package com.nphumbert.mars

data class Position(val x: Int, val y: Int, val orientation: Orientation)

enum class Orientation(private val left: () -> Orientation) {
    NORTH({ WEST }), SOUTH({ EAST }), EAST({ NORTH }), WEST({ SOUTH });

    fun left(): Orientation = left.invoke()
}

