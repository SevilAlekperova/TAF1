package steps;


import pages.ContainerMenuPage;
import pages.ManeMenuPage;


public class MainPageStep {

    ManeMenuPage maneMenuPage;
    ContainerMenuPage containerMenuPage;

    public MainPageStep() {
        maneMenuPage = new ManeMenuPage();
        containerMenuPage = new ContainerMenuPage();
    }


    public ManeMenuPage addSauceLabsBaskPack() {
        maneMenuPage.addToShoppingCarsStepSauceLabsBackPack();
        return maneMenuPage;
    }

    public ManeMenuPage removeSauceLabsBaskPack() {
        maneMenuPage.removeToShoppingCarsStepSauceLabsBackPack();
        return maneMenuPage;
    }


    public ManeMenuPage addSauceLabsBikeLight() {
        maneMenuPage.addToShoppingCarsStepSauceLabsBikeLight();
        return maneMenuPage;
    }

    public ManeMenuPage removeSauceLabsBikeLight() {
        maneMenuPage.removeToShoppingCarsStepSauceLabsBikeLight();
        return maneMenuPage;
    }

    public ManeMenuPage addSauceLabsBoltTShirt() {
        maneMenuPage.addToShoppingCartStepSauceLabsBoltTShirt();
        return maneMenuPage;
    }

    public ManeMenuPage removeSauceLabsBoltTShirt() {
        maneMenuPage.removeToShoppingCartStepSauceLabsBoltTShirt();
        return maneMenuPage;
    }

    public ManeMenuPage addSauceSauceLabsFleeceJacket() {
        maneMenuPage.addToShoppingCartStepSauceSauceLabsFleeceJacket();
        return maneMenuPage;
    }

    public ManeMenuPage removeSauceSauceLabsFleeceJacket() {
        maneMenuPage.removeToShoppingCartStepSauceSauceLabsFleeceJacket();
        return maneMenuPage;
    }

    public ManeMenuPage addSauceLabsOnesie() {
        maneMenuPage.addToShoppingCartStepSauceLabsOnesie();
        return maneMenuPage;
    }

    public ManeMenuPage removeSauceLabsOnesie() {
        maneMenuPage.removeToShoppingCartStepSauceLabsOnesie();
        return maneMenuPage;
    }

    public ManeMenuPage addTShirtRed() {
        maneMenuPage.addToShoppingCarsStepTShirtRed();
        return maneMenuPage;
    }

    public ManeMenuPage removeTShirtRed() {
        maneMenuPage.removeToShoppingCarsStepTShirtRed();
        return maneMenuPage;
    }

    public String takeValueOfBasket() {
        return maneMenuPage.getShoppingCartValueLocators().getText();
    }


    public void сlickOnTwiter() {
        maneMenuPage.twitterClick();
    }

    public void сlickOnFacebook() {
        maneMenuPage.facebookClick();
    }

    public void goToCheckoutPage() {
        maneMenuPage.clickToCheckoutPage();
    }

}
