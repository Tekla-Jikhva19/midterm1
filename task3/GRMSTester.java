package midterm.tekla_jikhvashvili_2.task3;

public class GRMSTester {
    public static void main(String[] args) {
        Recipe r1 = new Recipe();
        r1.setTitle("Khachapuri");
        r1.setIngredients("Flour, cheese, eggs, butter, milk");
        r1.setInstructions("Mix flour, cheese, eggs, and butter. Bake in the oven.");

        Recipe r2 = new Recipe();
        r2.setTitle("Khinkali");
        r2.setIngredients("Flour, meat, onion, water");
        r2.setInstructions("Make dough with flour and water. Fill with meat and onion. Boil in water.");

        GRMS grms = new GRMS();
        grms.addRecipe(r1);
        grms.addRecipe(r2);

        grms.removeRecipe(r1);

        grms.printRecipes();
    }
}
