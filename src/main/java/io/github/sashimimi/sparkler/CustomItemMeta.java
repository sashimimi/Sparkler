package io.github.sashimimi.sparkler;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;

public class CustomItemMeta 
{
	public static ItemStack americanBanner()
	{
		ItemStack item = new ItemStack(Material.RED_BANNER, 1);
		BannerMeta meta = (BannerMeta) item.getItemMeta();
		List<Pattern> patterns = new ArrayList<Pattern>();
		
		patterns.add(new Pattern(DyeColor.WHITE, PatternType.STRIPE_SMALL));
		patterns.add(new Pattern(DyeColor.BLUE, PatternType.SQUARE_TOP_LEFT));
		
		meta.setPatterns(patterns);
		item.setItemMeta(meta);
		
		return item;
	}
}
