import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class ShapesTest {
	private static final Random RANDOM = new Random();

	/**
	 * TODO rectangles with equal sizes must be equal squares with eqal sides
	 * must be equal Rectangles setWidth should change width, setHeight should
	 * change height squares....?
	 **/
	@Test
	public void equalRectanglesMustBeEqual() {
		for (int i = 0; i < 100; i++) {
			Rectangle 
				r1 = arbitaryRectangle(), 
				r2 = new Rectangle(r1.getWidth(), r1.getHeight());
			assertEquals(r2, r1);
		}
	}

	@Test
	public void equalSquaresMustBeEqual() {
		for (int i = 0; i < 100; i++) {
			Square 
				s1 = arbitarySquare(), 
				s2 = new Square(s1.getWidth());
			assertEquals(s2, s1);
		}
	}

	@Test
	public void setRectangleWidthShouldChangeOnlyWidth() {
		for (int i = 0; i < 100; i++) {
			Rectangle r1 = arbitaryRectangle();
			
			int 
				width=RANDOM.nextInt(50),
				height=r1.getHeight();
			r1.setWidth(width);
			assertEquals(width, r1.getWidth());
			assertEquals(height, r1.getHeight());

		}
	}

	@Test
	public void squareMustBeSquare() {
		for (int i = 0; i < 100; i++) {
			Square s= arbitarySquare();
			int side=RANDOM.nextInt(50);
			s.setHeight(side);
			assertEquals(side,s.getWidth());
			assertEquals(side,s.getHeight());
		}
	}

	private Rectangle arbitaryRectangle() {
		return RANDOM.nextBoolean()
				? new Rectangle(RANDOM.nextInt(50), RANDOM.nextInt(50))
				: arbitarySquare();
	}

	private Square arbitarySquare() {
		return new Square(RANDOM.nextInt(50));
	}
}
