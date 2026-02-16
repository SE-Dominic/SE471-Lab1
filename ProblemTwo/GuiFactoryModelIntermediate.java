package ProblemTwo;

public class GuiFactoryModelIntermediate implements AbstractGUIFactoryIF {

  @Override
  public CharacterPanelIF createCharacterSelectionPanel() {
    return new CharacterPanelInter();
  }

  @Override
  public WeaponPanelIF createWeaponSelectionPanel() {
    return new WeaponPanelInter();
  }
}
