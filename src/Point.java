public class Point implements Comparable<Point>{

    String name;
    Integer x;
    Integer y;

    public String getName() {
        return name;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Point(String name, Integer x, Integer y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        int differenceX = this.x - o.x;
        int differenceName = this.name.compareTo(o.name);
        int differenceY = this.y - o.y;
        if(differenceY != 0){
            return differenceY;
        }
        if(differenceX != 0) {
            return differenceX;
        }
        return differenceName;
    }
}
