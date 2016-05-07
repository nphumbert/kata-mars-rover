package com.nphumbert.mars

interface Instruction {
    fun apply(position: Position): Position
}

class RotateLeft : Instruction {
    override fun apply(position: Position): Position {
        return Position(position.x, position.y, position.orientation.left())
    }
}

class MoveForward : Instruction {
    override fun apply(position: Position): Position {
        throw UnsupportedOperationException()
    }
}

class RotateRight : Instruction {
    override fun apply(position: Position): Position {
        throw UnsupportedOperationException()
    }
}


