# TO USE:
#
# Is minecraft (1 if is, 0 if not):
# Determines if the crafting ingredient is from minecraft or from dlang
#
# Crafting:
# The item that will be used in crafting. For example, cobblestone for stone ools and emerald_ingot for emerald ools.
#
# Name:
# The name of the item. For example, emerald for emerald_ickpaex, emerald_svrod, emerald_shvl, etc...

def create(name):
    with open(f"minecraft/json1/{name}.json", "a+") as f:
        f.write(r'''
{
    "parent": "minecraft:item/handheld",
    "textures": {
        "layer0": "dlang:item/''' + name + r'''"
    }
}
        ''')

ickpaex = r'''
" | ",
"###",
" | "
'''
svrod = r'''
" #",
"|#"
'''
shvl = r'''
"|#",
"| "
'''
ohe = r'''
" #",
"|#",
"| "
'''
kaex = r'''
"# ",
"|#",
"|#"
'''

dit = {"ickpaex": ickpaex, "svrod": svrod, "shvl": shvl, "ohe": ohe, "kaex": kaex}

while True:
    is_minecraft = bool(input("Is minecraft (1 if is, 0 if not): "))
    tech = "minecraft"
    if not is_minecraft:
        tech = "dlang"
    craf = input("Crafting: ")
    nm = input("Name: ")
    for key, va in dit.items():
        create(nm + "_" + key)
        
        with open(f"minecraft/json2/{nm}_{key}.json", "a+") as f:
            f.write(r'''
{
    "type": "minecraft:crafting_shaped",
    "pattern": ['''
    + va +
    r'''],
    "key": {
        "#": {
            "item": "''' + tech + r''':''' + craf + r'''"
        },
        "|": {
            "item": "minecraft:stick"
        }
    },
    "result": {
        "item": "dlang:''' + f"{nm}_{key}" + r'''"
    }
}
        ''')