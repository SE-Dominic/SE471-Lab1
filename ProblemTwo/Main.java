package ProblemTwo;

public class Main {

  public static void main(String[] args) {
    System.out.println("Testing video game GUI with Abstract Factory Pattern");

    // Test beginner mode
    System.out.println("\nBeginner Mode:");
    AbstractGUIFactoryIF beginnerFactory = new GuiFactoryModelBeginner();
    CharacterPanelIF charPanel1 = beginnerFactory.createCharacterSelectionPanel();
    WeaponPanelIF weaponPanel1 = beginnerFactory.createWeaponSelectionPanel();
    charPanel1.selectCharacter();
    weaponPanel1.selectWeapon();

    // Test intermediate mode
    System.out.println("\nIntermediate Mode:");
    AbstractGUIFactoryIF intermediateFactory = new GuiFactoryModelIntermediate();
    CharacterPanelIF charPanel2 = intermediateFactory.createCharacterSelectionPanel();
    WeaponPanelIF weaponPanel2 = intermediateFactory.createWeaponSelectionPanel();
    charPanel2.selectCharacter();
    weaponPanel2.selectWeapon();

    // Test advanced mode
    System.out.println("\nAdvanced Mode:");
    AbstractGUIFactoryIF advancedFactory = new GuiFactoryModelHard();
    CharacterPanelIF charPanel3 = advancedFactory.createCharacterSelectionPanel();
    WeaponPanelIF weaponPanel3 = advancedFactory.createWeaponSelectionPanel();
    charPanel3.selectCharacter();
    weaponPanel3.selectWeapon();
  }
}
