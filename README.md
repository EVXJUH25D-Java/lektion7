---
author: Lektion 7
date: MMMM dd, YYYY
paging: "%d / %d"
---

# Lektion 7

Hej och välkommen!

## Dagens agenda

1. Frågor och repetition
2. Introduktion till felhantering
3. Repetition av Git
4. Övning med handledning

---

# Fråga

Kan du göra en video med hur man använder Git? Hade velat pausa under lektionen och tagit det steg för steg

# Svar

Jag hade glömt att jag har en video sedan innan: [se på YouTube](https://youtu.be/5TIMfCIugDI?si=mFjtNxaXoN44SUB9)
Kolla även på [denna Git på svenska spellista](https://www.youtube.com/watch?v=0nfyNwYZzZ4&list=PLwh73nXB3whgormDmX_skiiJfHfOa9Jgd&index=1).

---

# Fråga

Jag har problem med att sortera transaktioner veckovis i den individuella uppgiften. Till exempel, om jag gör en transaktion den 2025/09/14 kan jag enkelt sortera den årsvis, månadsvis och dagvis utifrån datumet, men hur gör man för att sortera den veckovis? Hur kan man få Java att “förstå” vilken vecka ett datum tillhör?

# Svar

`Date` har inga metoder för veckor, därför måste det räknas ut manuellt. Tips/hints:

- Utnyttja `getTime()` metoden
- Räkna skillnader mellan tider
- Kom ihåg att '1 vecka' = '7 dagar' = '168 timmar' etc.
