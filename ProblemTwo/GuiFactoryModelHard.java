package ProblemTwo;

public class GuiFactoryModelHard implements AbstractGUIFactoryIF {

  @Override
  public CharacterPanelIF createCharacterSelectionPanel() {
    return new CharacterPanelHard();
  }

  @Override
  public WeaponPanelIF createWeaponSelectionPanel() {
    return new WeaponPanelHard();
  }
}
