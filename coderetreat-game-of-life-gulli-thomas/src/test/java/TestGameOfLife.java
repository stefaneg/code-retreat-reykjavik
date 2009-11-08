import static junit.framework.Assert.*;
import org.junit.Test;

public class TestGameOfLife {

    @Test
    public void live_cell_with_one_neighbour_should_die() {
        final Cell cell = new Cell();
        assertTrue(cell.isAlive());
        cell.setNeighbour(1);
        assertFalse(cell.isAlive()); // Always start with an assertion!
    }

    @Test
    public void live_cell_with_two_neighbours_should_live() {
        final Cell cell = new Cell();
        assertTrue(cell.isAlive());
        cell.setNeighbour(2);
        assertTrue(cell.isAlive()); // Always start with an assertion!
    }

    @Test
    public void live_cell_with_four_neighbours_should_die() {
        final Cell cell = new Cell();
        assertTrue(cell.isAlive());
        cell.setNeighbour(4);
        assertFalse(cell.isAlive()); // Always start with an assertion!
    }

    @Test
    public void live_cell_with_five_neighbours_should_die() {
        final Cell cell = new Cell();
        assertTrue(cell.isAlive());
        cell.setNeighbour(5);
        assertFalse(cell.isAlive());
    }

    @Test
    public void dead_cell_with_three_neighbours_should_live() {
        final Cell cell = new Cell();
        cell.setNeighbour(5);
        assertFalse(cell.isAlive());
        cell.setNeighbour(3);
        assertTrue(cell.isAlive());
    }

    @Test
    public void live_cell_with_three_neighbours_should_live() {
        final Cell cell = new Cell();
        assertTrue(cell.isAlive());
        cell.setNeighbour(3);
        assertTrue(cell.isAlive());
    }

    @Test
    public void live_cell_with_no_neighbours_should_die() {
        final Cell cell = new Cell();
        assertTrue(cell.isAlive());
        cell.setNeighbour(0);
        assertFalse(cell.isAlive());
    }

    @Test
    public void dead_cell_with_two_neighbours_should_stay_dead() {
        final Cell cell = new Cell();
        assertTrue(cell.isAlive());
        cell.setNeighbour(0);
        assertFalse(cell.isAlive());
        cell.setNeighbour(2);
        assertFalse(cell.isAlive());
    }
}
