package com.nphumbert.mars

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RotateLeftTest {

    @Test
    fun should_face_west_when_facing_north_and_rotate_left() {
        assertThat(RotateLeft().apply(Position(1, 2, Orientation.NORTH))).isEqualTo(Position(1, 2, Orientation.WEST))
    }

    @Test
    fun should_face_south_when_facing_west_and_rotate_left() {
        assertThat(RotateLeft().apply(Position(1, 2, Orientation.WEST))).isEqualTo(Position(1, 2, Orientation.SOUTH))
    }

    @Test
    fun should_face_east_when_facing_south_and_rotate_left() {
        assertThat(RotateLeft().apply(Position(1, 2, Orientation.SOUTH))).isEqualTo(Position(1, 2, Orientation.EAST))
    }

    @Test
    fun should_face_north_when_facing_east_and_rotate_left() {
        assertThat(RotateLeft().apply(Position(1, 2, Orientation.EAST))).isEqualTo(Position(1, 2, Orientation.NORTH))
    }

}

class RotateRightTest {

    @Test
    fun should_face_west_when_facing_south_and_rotate_right() {
        assertThat(RotateRight().apply(Position(1, 2, Orientation.SOUTH))).isEqualTo(Position(1, 2, Orientation.WEST))
    }

    @Test
    fun should_face_south_when_facing_east_and_rotate_right() {
        assertThat(RotateRight().apply(Position(1, 2, Orientation.EAST))).isEqualTo(Position(1, 2, Orientation.SOUTH))
    }

    @Test
    fun should_face_east_when_facing_north_and_rotate_right() {
        assertThat(RotateRight().apply(Position(1, 2, Orientation.NORTH))).isEqualTo(Position(1, 2, Orientation.EAST))
    }

    @Test
    fun should_face_north_when_facing_west_and_rotate_right() {
        assertThat(RotateRight().apply(Position(1, 2, Orientation.WEST))).isEqualTo(Position(1, 2, Orientation.NORTH))
    }

}


