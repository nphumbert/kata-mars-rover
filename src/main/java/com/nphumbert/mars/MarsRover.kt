package com.nphumbert.mars

class MarsRover {
    fun compute(input: String): String {
        val (gridDimensionInput, initialPositionInput, pathInput) = input.split("\n")

        val (x, y, orientation) = initialPositionInput.split(" ")
        val initialPosition = Position(x.toInt(), y.toInt(), Orientation.valueOf(orientation))

        val path = Path(pathInput.toCharArray().map { InstructionValue.valueOf(it.toString()) })
        val finalPosition = path.computeDestination(initialPosition)

        return "${finalPosition.x} ${finalPosition.y} ${finalPosition.orientation}"
    }

}

data class Path(val instructions: List<Instruction>) {

    fun computeDestination(initialPosition: Position): Position {
        var currentPosition = initialPosition
        instructions.forEach { currentPosition = it.apply(currentPosition) }
        return currentPosition
    }

}

data class Position(val x: Int, val y: Int, val orientation: Orientation) {

}

enum class Orientation {
    N, S, E, O
}

enum class InstructionValue : Instruction {
    L, R, M;

    override fun apply(position: Position): Position {
        throw UnsupportedOperationException("not implemented")
    }
}

interface Instruction {
    fun apply(position: Position): Position
}
