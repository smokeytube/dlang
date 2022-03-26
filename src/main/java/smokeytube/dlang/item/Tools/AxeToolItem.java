package smokeytube.dlang.item.Tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class AxeToolItem extends AxeItem {
    public AxeToolItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}