import java.util.HashMap;
import java.awt.Color;
public class Board {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();

    public void setPieces(Coordinates coordinates, Piece piece){
        piece.coordinates = coordinates;
        pieces.put(coordinates, piece);
    }
    //Расстановка фигур на доске
    public void setupDefaultPiecesPosition(){
        for(File file : File.values()){
            setPieces(new Coordinates(file, 2), new Pawn(Color.WHITE, new Coordinates(file, 2 )));
            setPieces(new Coordinates(file, 7), new Pawn(Color.BLACK, new Coordinates(file, 7 )));

        }
    }
}
