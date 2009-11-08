public class Cell {
    
    private int neighbours;

    boolean live = true;


    public void setNeighbour(int neighbours) {
        this.neighbours = neighbours;
        live = !(neighbours <= 1 || neighbours >= 4);
    }

    public boolean isAlive() {
        return live;
    }
}
