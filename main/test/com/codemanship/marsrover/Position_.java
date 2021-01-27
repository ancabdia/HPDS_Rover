package com.codemanship.marsrover;

import javafx.geometry.Pos;
import org.junit.Test;
import refactoring.Rover;
import refactoring.Rover.Position;


import static org.assertj.core.api.Assertions.assertThat;
import static refactoring.Rover.Heading.*;

public class Position_ {

	@Test
	public void should_calculate_forward_position() {
		assertThat(new Position(0,0).forward(North)).isEqualTo(new Position(0,1));
		assertThat(new Position(0,0).forward(South)).isEqualTo(new Position(0,-1));
		assertThat(new Position(0,0).forward(East)).isEqualTo(new Position(1,0));
	}
}
