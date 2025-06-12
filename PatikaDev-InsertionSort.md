# Insertion Sort Projesi

## Proje 1

### Insertion Sort Aşamaları

Verilen dizi:  
`[22, 27, 16, 2, 18, 6]`

Insertion Sort algoritmasında, her adımda bir eleman alınır ve solundaki alt diziye uygun şekilde yerleştirilir.

**Adım adım sıralama:**

1. `[22, 27, 16, 2, 18, 6]` → İlk iki eleman zaten sıralı.
2. `[22, 27, 16, 2, 18, 6]`  
   → 16 alınır, 27 ve 22'den küçük → sola kaydırılır  
   → `[16, 22, 27, 2, 18, 6]`
3. `[16, 22, 27, 2, 18, 6]`  
   → 2 alınır, tümünden küçük → başa gelir  
   → `[2, 16, 22, 27, 18, 6]`
4. `[2, 16, 22, 27, 18, 6]`  
   → 18 alınır, 27'den küçük → sola kaydırılır  
   → `[2, 16, 18, 22, 27, 6]`
5. `[2, 16, 18, 22, 27, 6]`  
   → 6 alınır, 27, 22, 18, 16'dan küçük  
   → sola kaydırılır ve 2'den büyük olduğu yere yerleşir  
   → `[2, 6, 16, 18, 22, 27]`

**Sonuç:** `[2, 6, 16, 18, 22, 27]`

---

### Big-O Gösterimi

Insertion Sort’un en kötü durumda (dizinin tamamen ters sıralı olması) karmaşıklığı:

**O(n²)**

- Best Case: O(n) → Dizi zaten sıralıysa
- Average Case: O(n²)
- Worst Case: O(n²)

---

### Time Complexity: 18 sayısı hangi duruma girer?

18 sayısı sıralanmış dizide ortalarda yer alır:  
`[2, 6, 16, 18, 22, 27]`

→ Bu nedenle **Average Case** kapsamına girer.

---

## Best Case - Average Case - Worst Case Nedir?

**Best Case:**  
Algoritmanın en az işlem yaptığı en iyi durumdur.  
→ Insertion Sort için, dizi zaten sıralıysa (her eleman yerinde), algoritma her adımda sadece bir karşılaştırma yapar.  
**Zaman karmaşıklığı:** O(n)

**Average Case:**  
Rastgele sıralanmış bir dizi söz konusu olduğunda ortalama senaryo.  
→ Bazı elemanlar yerinde, bazıları yer değiştirecek.  
**Zaman karmaşıklığı:** O(n²)

**Worst Case:**  
En fazla işlem yapılan en kötü durumdur.  
→ Insertion Sort için, dizi tamamen ters sıralıysa, her eleman tüm solundaki elemanlarla karşılaştırılır.  
**Zaman karmaşıklığı:** O(n²)

---

## Selection Sort – İlk 4 Adım

Verilen dizi: `[7, 3, 5, 8, 2, 9, 4, 15, 6]`

**Selection Sort**, her adımda en küçük elemanı bulup başa koyar.

### Adım 1:
Dizideki en küçük eleman: 2  
→ 2 ile ilk eleman (7) yer değiştirir  
`[2, 3, 5, 8, 7, 9, 4, 15, 6]`

### Adım 2:
Kalan alt dizi: `[3, 5, 8, 7, 9, 4, 15, 6]`  
En küçük: 3 (zaten yerinde)  
`[2, 3, 5, 8, 7, 9, 4, 15, 6]`

### Adım 3:
Kalan alt dizi: `[5, 8, 7, 9, 4, 15, 6]`  
En küçük: 4  
→ 4 ile 5 yer değiştirir  
`[2, 3, 4, 8, 7, 9, 5, 15, 6]`

### Adım 4:
Kalan alt dizi: `[8, 7, 9, 5, 15, 6]`  
En küçük: 5  
→ 5 ile 8 yer değiştirir  
`[2, 3, 4, 5, 7, 9, 8, 15, 6]`

---

## Insertion Sort vs Selection Sort – Farkları

| Özellik | Insertion Sort | Selection Sort |
|--------|----------------|----------------|
| **Yöntem** | Her yeni elemanı, solundaki sıralı kısma yerleştirir | En küçük elemanı bulup başa alır |
| **Zaman Karmaşıklığı (Best Case)** | O(n) | O(n²) |
| **Zaman Karmaşıklığı (Average/Worst)** | O(n²) | O(n²) |
| **Karşılaştırma Sayısı** | En iyi durumda az | Sabit şekilde çok |
| **Yer değiştirme sayısı** | Genellikle daha az | Yer değiştirme sayısı az ama karşılaştırma çok |
| **Avantajı** | Kısmen sıralı dizilerde hızlıdır | Uygulaması basittir, ama yavaş çalışır |
| **Stabil mi?** | Evet | Hayır |

---

**Sonuç olarak:**  
- Kısmen sıralı dizilerde **Insertion Sort** daha verimlidir.  
- **Selection Sort**, sıralı olup olmamasına bakmaksızın her zaman aynı şekilde çalışır, bu da onu daha yavaş yapar.


