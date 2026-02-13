package ProblemTwo;

public class GuiFactoryModeBeginner implements AbstractGUIFactoryIF{
    @Override
    public CharacterPanelIF createCharacterSelectionPanel() {
        return new CharacterPanelIF();
    }
    @Override
    public WeaponPanelIF createWeaponSelectionPanel() {
        return new WeaponPanelIF();
    }
}
