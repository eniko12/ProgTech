# ProgTech beadandó

## Célok
Egy kezdetleges Gamify Your Life alkalmazást szeretnék készíteni, lényegében lenne egy karakter akinek a képességei fejleszthetőek különböző feladatok elvégzésével. (A Gamify Your Life alkalmazásoknál ezeket a felhasználó végzi el a mindennapjai során és aztán elvégzettnek jelöli a feladatot. Pl.: olvasni egy könyvből 1 fejezetet, gyakorolni az idegen nyelvet).  

## Megvalósítandó funkciók
  
- **A karakternek volna egy profilja:**
  - névvel
  -  szinttel
  -  feladatokkal
  -  az elvégzett feladatok alapján számítva az erősségeivel

- **Három típusú feladat jelenne meg:** 
   - munkához kapcsolódó
   - hobbihoz kapcsolódó 
   - egyéb 

- meg lehetne tekinteni a karakter profilját
-  listázni a feladatokat
-  listázni az elvégzett feladatokat
-  a feladatokat lehetne törölni, módosítani és pipálni 
-  lehetőség lenne az előzmények megtekintésére 
  
## Tervezési minták
- **MVC** tervezési mintának megfelelően épülne fel
- előzményekhez loggger használata, itt használnám a **Singleton**-t.
- a 3 feladat típust **stratégiaként** írnám fel
- Hogy mindig a legfrisebb feladatok jelenjenek meg a profilon **Observer**-t használnék

> Written with [StackEdit](https://stackedit.io/).
