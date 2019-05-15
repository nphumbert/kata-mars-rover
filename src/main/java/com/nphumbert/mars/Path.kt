package com.nphumbert.mars

data class Path(val instructions: List<Instruction>) {

    fun computeDestination(initialPosition: Position): Position =
        instructions.fold(initialPosition) { acc, nextInstruction -> nextInstruction.apply(acc) }
    
}

