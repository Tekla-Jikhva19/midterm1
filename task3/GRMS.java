package midterm.tekla_jikhvashvili_2.task3;

import java.util.ArrayList;
import java.util.List;

public class GRMS {
    private List<Recipe> storage = new ArrayList<>();

    public void addRecipe(Recipe recipe) {
        storage.add(recipe);
    }

    public boolean removeRecipe(Recipe recipe) {
        return storage.remove(recipe);
    }

    public void printRecipes() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for (Recipe recipe : storage) {
                System.out.println(recipe);
            }
        }
    }
}

