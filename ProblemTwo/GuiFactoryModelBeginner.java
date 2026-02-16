package ProblemTwo;

public class GuiFactoryModelBeginner implements AbstractGUIFactoryIF {

  @Override
  public CharacterPanelIF createCharacterSelectionPanel() {
    return new CharacterPanelBeg();
  }

  @Override
  public WeaponPanelIF createWeaponSelectionPanel() {
    return new WeaponPanelBeg();
  }
}
