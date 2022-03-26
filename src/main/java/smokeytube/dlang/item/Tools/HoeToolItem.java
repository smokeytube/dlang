package smokeytube.dlang.item.Tools;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class HoeToolItem extends HoeItem {
    public HoeToolItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}