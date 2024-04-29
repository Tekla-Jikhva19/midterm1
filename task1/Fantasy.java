package midterm.tekla_jikhvashvili_2.task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName;

    // Constructor
    public Fantasy(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String getGeometry1() {
        // TODO: Implement this method to return the geometry
        return "Geometry of Fantasy";
    }

    @Override
    public String getWind2() {
        // TODO: Implement this method to return the wind
        return "Wind of Fantasy";
    }

    @Override
    public String methodTax3(String argHdmi5) {
        // TODO: Implement this method to perform tax-related operation
        return "Tax calculation based on: " + argHdmi5;
    }

    @Override
    public List<String> methodFeline4(String argVeterinarian6) {
        // TODO: Implement this method to perform feline-related operation
        // For example:
        // List<String> result = new ArrayList<>();
        // result.add("Operation with feline based on: " + argVeterinarian6);
        // return result;
        return null; // Placeholder, replace this with actual implementation
    }

    @Override
    public String toString() {
        return "Fantasy{" +
                "studentName='" + studentName + '\'' +
                '}';
    }
}

