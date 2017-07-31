package main.java.net.proselyte.Practice.Developer;


public class DeveloperTest {
    public static void main(String args[]) throws Exception {

//        DeveloperView developerView = new DeveloperView();
//        developerView.consoleView();


        DeveloperDAO developerDAO = new DeveloperDAO();

        Developer ivan = new Developer(1, "Ivan", "Ivanov", "Java Developer", 3, 3000);

        Developer dasha = new Developer(2, "Dasha", "Huyasha", "Java Junior Developer", 1, 1000);

        Developer sasha = new Developer(3, "Sasha", "Promokasha", "Java Middle", 2, 2000);

        Developer lasha = new Developer(3, "Lasha", "aSASsasasass", "Java Middle", 2, 2000);

//        developerDAO.save(ivan);
//        developerDAO.save(dasha);
//        developerDAO.save(sasha);
//        developerDAO.save(lasha);

//        dasha.setId(10);
//
//        developerDAO.update(dasha);
//        developerDAO.update(ivan);
//        developerDAO.getById(2);

//        developerDAO.remove(3);

    }
}