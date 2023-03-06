public class Coordinates {
    public final File file; // горизанталь (буквы)
    public final Integer rank;   // вертикаль (цифры)
    // final значит у существующего объекта координат они не могут быть изменены


    public Coordinates(File file, Integer rank) {
        this.file = file;
        this.rank = rank;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Coordinates that = (Coordinates) object;

        if (!file.equals(that.file)) return false;
        if (!rank.equals(that.rank)) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + file.hashCode();
        result = 31 * result + rank.hashCode();
        return result;
    }
}
