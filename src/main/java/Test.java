public class Test {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();

        myAnimal.setName("Eagle");
        myAnimal.setAverageWeight(1.5);
        myAnimal.setNumberOfLegs(2);

        System.out.println("Name: " + myAnimal.getName());
        System.out.println("Average weight: " + myAnimal.getAverageWeight() + "kg");
        System.out.println("Number of legs: " + myAnimal.getNumberOfLegs());
    }

    Eagle myEagle = new Eagle();

		/*System.out.println("Name: " + myEagle.name); 			System.out.println("Reproduction: " + myEagle.reproduction);
		System.out.println("Outer covering: " + myEagle.outerCovering);
		System.out.println("Lifespan: " + myEagle.lifespan);
		myEagle.flyUp();
		myEagle.flyDown();*/
}
