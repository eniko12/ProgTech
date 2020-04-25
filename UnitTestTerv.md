# Unit Test Terv
|A teszt tárgya| Teszteset | Kilépési feltétel | 
|-- |--| --|
| Név megadása | Megfelelő hosszú név megadása |	Tovább lépés a profilra |
|Feladat megadása |Új feladat hozzáadása| Megjelenik a feladatok listáján|
|Feladat törlése | Meglévő feladat kitörlése  |	Eltűnik a feladatok listájáról |
| Feladat módosítása| Meglévő feladat módosítása | A módosult változat jelenik meg a feladatok listájában |
| Pontok hozzáadása (Hobbi)| Elvégzünk egy feladatot | A megfelelő mennyiségű pont megjelenik a megfelelő kategóriánál |
| Pontok hozzáadása (Munka)| Elvégzünk egy feladatot | A megfelelő mennyiségű pont megjelenik a megfelelő kategóriánál |
| Pontok hozzáadása (Egyéb)| Elvégzünk egy feladatot | A megfelelő mennyiségű pont megjelenik a megfelelő kategóriánál |
|Előzmények megtekintése|Elvégzünk egy feladatot| A legutóbb elvégzett feladatot látjuk az előzmények között|


|A teszt tárgya| Teszteset | Kilépési feltétel | 
|-- |--| --|
| ProfileModel: setName |Megadjuk a nevet.  |	A megadott nevet megfelelő formába alakítja. Első betű nagy a többi kicsi. |
|ProfileModdel: setGold | Odaadjuk a beállítandó értéket. | Be állítja a megadott arany mennyiséget. Ha a negatív értéket kap, autómatikusan 0-át ad vissza, egyéb esetben a kapott értéket. |
| TasksContainerModel: getAll | Lekérjük az osztály lista mezőjének elemeit. |	A listán lévő minden elemet visszaad. |
| TasksContainerModel: addTask | Hozzáadunk egy új Task-ot a listához. | A hozzáadás megtörténik és ez rögzítésre is kerül a History-ban is. |
| TasksContainerModel: removeTask | Eltávolítunk egy feladatot. | A megfelelő feladat törlődik a listáról. |

