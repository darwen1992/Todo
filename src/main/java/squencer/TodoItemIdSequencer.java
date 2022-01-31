package squencer;

public class TodoItemIdSequencer {

    static int curentId;


    static int nextId(){

        return curentId++;
    }
    public static int getCurentId() {
        return curentId;
    }

    public static void setCurentId(int curentId) {
        PersonIdSequencer.curentId = curentId;
    }
}
