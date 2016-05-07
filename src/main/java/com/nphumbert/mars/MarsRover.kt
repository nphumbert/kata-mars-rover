package com.nphumbert.mars

import java.util.*

class MarsRover {

    private val instructions = HashMap<Char, Instruction>()
    private val orientations = HashMap<Char, Orientation>()

    constructor() {
        instructions.put('L', RotateLeft())
        instructions.put('R', RotateRight())
        instructions.put('M', MoveForward())

        orientations.put('N', Orientation.NORTH)
        orientations.put('S', Orientation.SOUTH)
        orientations.put('E', Orientation.EAST)
        orientations.put('W', Orientation.WEST)
    }

    fun compute(input: String): String {
        val (gridDimensionInput, initialPositionInput, pathInput) = input.split("\n")

        val (x, y, orientation) = initialPositionInput.split(" ")
        val initialPosition = Position(x.toInt(), y.toInt(), parseOrientation(orientation[0]))

        val path = Path(pathInput.toCharArray().map { parseInstruction(it) })
        val finalPosition = path.computeDestination(initialPosition)

        return "${finalPosition.x} ${finalPosition.y} ${toString(finalPosition.orientation)}"
    }

    private fun parseOrientation(input: Char): Orientation = orientations.getOrElse(input, { throw IllegalArgumentException("Unknown instruction $input") })

    private fun parseInstruction(input: Char): Instruction = instructions.getOrElse(input, { throw IllegalArgumentException("Unknown instruction $input") })

    private fun toString(orientation: Orientation): String = orientations.filterValues { it.equals(orientation) }.keys.first().toString()
}