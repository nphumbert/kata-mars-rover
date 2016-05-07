package com.nphumbert.mars

class MarsRover {
    fun compute(input: String): String {
        val (gridDimensionInput, initialPositionInput, pathInput) = input.split("\n")

        val (x, y, orientation) = initialPositionInput.split(" ")
        val initialPosition = Position(x.toInt(), y.toInt(), Orientation.valueOf(orientation))

        val path = Path(pathInput.toCharArray().map { Instruction.valueOf(it.toString()) })
        val finalPosition = path.computeDestination(initialPosition)

        return "${finalPosition.x} ${finalPosition.y} ${finalPosition.orientation}"
    }

}

data class Path(val instructions: List<Instruction>) {
    fun computeDestination(initialPosition: Position): Position {
        throw UnsupportedOperationException("not implemented")
    }

}

data class Position(val x: Int, val y: Int, val orientation: Orientation) {

}

enum class Orientation {
    N, S, E, O
}

enum class Instruction {
    L, R, M
}