package com.nphumbert.mars

data class Path(val instructions: List<Instruction>) {

    fun computeDestination(initialPosition: Position): Position {
        var currentPosition = initialPosition
        instructions.forEach { currentPosition = it.apply(currentPosition) }
        return currentPosition
    }

}

