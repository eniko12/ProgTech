# Unit Test Terv
|A teszt tárgya| Teszteset | Kilépési feltétel | Állapot |
|-- |--| --|--|
| Név | Valamilyen név megadása |	Megfelelő alakban jelenik meg a név| PASS
|Feladat megadása |Új feladat hozzáadása| Megjelenik a feladatok listáján| PASS
|Feladat törlése | Meglévő feladat kitörlése  |	Eltűnik a feladatok listájáról | PASS
| Feladat elvégezve| Feladat elvégzettnek jelölve | A jutalmak a profilhoz adódnak, a feladat eltűnik a feladatok listájáról | PASS
| Pontok hozzáadása (Hobbi)| Elvégzünk egy feladatot | A megfelelő mennyiségű pont megjelenik a megfelelő kategóriánál | PASS
| Pontok hozzáadása (Munka)| Elvégzünk egy feladatot | A megfelelő mennyiségű pont megjelenik a megfelelő kategóriánál | PASS
| Pontok hozzáadása (Egyéb)| Elvégzünk egy feladatot | A megfelelő mennyiségű pont megjelenik a megfelelő kategóriánál | PASS
|Előzmények megtekintése|Elvégzünk egy feladatot| A legutóbb elvégzett feladatot látjuk az előzmények között| PASS


Néhány a tesztekből:

|A teszt tárgya| Teszteset | Kilépési feltétel | Állapot |
|-- |--| --| -- |
| ProfileModel: setName |Megadjuk a nevet.  |	A megadott nevet megfelelő formába alakítja. Első betű nagy, a többi kicsi. | PASS
|ProfileModdel: setGold | Odaadjuk a beállítandó értéket. | Be állítja a megadott arany mennyiséget. Ha a negatív értéket kap, autómatikusan 0-át ad vissza, egyéb esetben a kapott értéket. | PASS
| TasksContainerModel: getAll | Lekérjük az osztály lista mezőjének elemeit. |	A listán lévő minden elemet visszaad. | PASS
| TasksContainerModel: addTask | Hozzáadunk egy új Task-ot a listához. | A hozzáadás megtörténik. | PASS
| TasksContainerModel: removeTask | Eltávolítunk egy feladatot. | A megfelelő feladat törlődik a listáról. | PASS
| HistoryModelTest: testGetInstance | Kétszer hozzuk létre a HistoryModel-t | A két példány megegyezeik a Singleton-nak megfelelően | PASS

