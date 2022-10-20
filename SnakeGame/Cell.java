public class Cell {
    private int row,col;
    private CellType celltype;
    
    public Cell(int row, int col, CellType celltype) {
        this.row = row;
        this.col = col;
    }
    
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }
    public CellType getCelltype() {
        return celltype;
    }
    public void setCelltype(CellType celltype) {
        this.celltype = celltype;
    }
}
