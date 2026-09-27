# Object-Oriented Design Patterns (මෘදුකාංග නිර්මාණ රටා)

Object-Oriented Design Patterns ගබඩාව (repository) වෙත සාදරයෙන් පිළිගනිමු! මෙම ව්‍යාපෘතිය අත්‍යවශ්‍ය Gang of Four (GoF) design patterns 13ක් සඳහා ප්‍රායෝගික මාර්ගෝපදේශයක් ලෙස ක්‍රියා කරයි.

Design pattern එකක් යනු මෘදුකාංග නිර්මාණයේදී නිතර මතුවන ගැටළු සඳහා නැවත භාවිත කළ හැකි අත්දුටු විසඳුමකි. මින් කේතය තවදුරටත් වර්ධනය කිරීමට (extensibility) සහ සංවර්ධකයන් අතර පොදු වචන මාලාවක් ගොඩනගා ගැනීමට උපකාරී වේ.

## පටුන (Table of Contents)

* [නිර්මාණාත්මක රටා (Creational Patterns)](#නිර්මාණාත්මක-රටා-creational-patterns)

* [ව්‍යුහාත්මක රටා (Structural Patterns)](#ව්‍යුහාත්මක-රටා-structural-patterns)

* [චර්යාත්මක රටා (Behavioral Patterns)](#චර්යාත්මක-රටා-behavioral-patterns)

* [මූලික සැලසුම් ප්‍රතිපත්ති (Design Principles)](#මූලික-සැලසුම්-ප්‍රතිපත්ති-design-principles)

## නිර්මාණාත්මක රටා (Creational Patterns)

*මෙම රටා objects නිර්මාණය කරන ආකාරය පිළිබඳව අවධානය යොමු කරයි. `new` keyword එක හරහා කෙලින්ම object එකක් සාදනවා වෙනුවට මෙය වඩාත් නම්‍යශීලී ක්‍රම භාවිතා කරයි.*

### 1. Builder

* **අරමුණ (Intent):** සංකීර්ණ object එකක් පියවරෙන් පියවර නිර්මාණය කිරීමට ඉඩ සලසයි. මෙහිදී එකම නිර්මාණ ක්‍රියාවලියක් හරහා විවිධ ආකාරයේ ප්‍රතිදානයන් ලබා ගත හැක.
* **භාවිතය (Use Case):** විවිධ විකල්ප කොටස් කිහිපයකින් සමන්විත සංකීර්ණ `Meal` (ආහාර වේලක්) එකක් හෝ `Document` එකක් පියවරෙන් පියවර ගොඩනැගීම.

### 2. Prototype

* **අරමුණ (Intent):** මුල සිටම අලුත් object එකක් හදනවා වෙනුවට, දැනටමත් පවතින object (prototype) එකක් පිටපත් (clone) කිරීම මගින් අලුත් objects නිර්මාණය කිරීම.
* **භාවිතය (Use Case):** Game එකක සතුරන් (enemies) විශාල ප්‍රමාණයක් ජනනය කිරීමේදී, සෑම විටම අලුතින් object එකක් initialize කරනවාට වඩා පවතින එකක් clone කිරීම කාර්යක්ෂම වීම.

## ව්‍යුහාත්මක රටා (Structural Patterns)

*classes සහ objects එකලස් කර විශාල සහ නම්‍යශීලී ව්‍යුහයන් ගොඩනගන ආකාරය මෙම රටා මගින් පෙන්වා දෙයි.*

### 3. Decorator

* **අරමුණ (Intent):** ධාවන කාලයේදී (dynamic at runtime) මූලික object එක වෙනස් නොකර ඒ වටා අමතර ක්‍රියාකාරකම් (responsibilities) එකතු කිරීම (wrapping).
* **භාවිතය (Use Case):** subclasses විශාල ප්‍රමාණයක් නොසාදා (Class Explosion) සාමාන්‍ය `EmailNotifier` එකකට අමතර features (උදා: SMS, Push) එකතු කිරීම.

### 4. Composite

* **අරමුණ (Intent):** Objects, රුක් ආකෘතියකට (tree structure) සකස් කරමින්, තනි objects (Leaves) සහ objects සමූහයන් (Composites) එකම ආකාරයකට (uniformly) භාවිතා කිරීමට client ට ඉඩ දීම.
* **භාවිතය (Use Case):** File system එකක `Folder` එකක් ඇතුළේ තවත් `Files` සහ `Folders` තිබිය හැකි අතර, ඒ ඕනෑම එකකට එකම විදියට `calculateSize()` method එක call කිරීමට හැකි වීම.

### 5. Bridge

* **අරමුණ (Intent):** Abstraction සහ Implementation එකිනෙකින් වෙන් කිරීම මගින් එම කොටස් දෙකම ස්වාධීනව වෙනස් වීමට ඉඩ හැරීම.
* **භාවිතය (Use Case):** `RemoteControl` වර්ග සහ `TV` වර්ග වෙන වෙනම වර්ධනය වීම. `SonyAdvancedRemote` ලෙස අලුත් class එකක් සාදනවා වෙනුවට, Remote එක තුළ TV interface එක රඳවා තබා ගැනීම (reference කිරීම).

### 6. Adapter

* **අරමුණ (Intent):** පවතින interface එකක්, client බලාපොරොත්තු වන වෙනත් interface එකකට පරිවර්තනය කිරීම. නොගැලපෙන classes දෙකකට එකට වැඩ කිරීමට මෙය ඉඩ සලසයි.
* **භාවිතය (Use Case):** පරණ third-party payment gateway API එකක්, අලුත් e-commerce app එකට ගැලපෙන විදියට වෙනස් කර සම්බන්ධ කිරීම (wrapping).

### 7. Flyweight

* **අරමුණ (Intent):** කුඩා objects විශාල ප්‍රමාණයක් භාවිතා කරන විට, පොදු දත්ත (common states) බෙදාහදා ගැනීම (sharing) හරහා මතකය (memory) ඉතා කාර්යක්ෂමව කළමනාකරණය කිරීම.
* **භාවිතය (Use Case):** Game එකක ගස් මිලියන ගණනක් සහිත කැලයක් render කිරීම; සෑම ගසකටම texture දත්ත අලුතින් load කරනවා වෙනුවට එකම texture එක share කර ඛණ්ඩාංක (coordinates) පමණක් වෙනස් කිරීම.

## චර්යාත්මක රටා (Behavioral Patterns)

*objects අතර සන්නිවේදනය සහ වගකීම් බෙදී යන ආකාරය මෙමගින් පැහැදිලි කරයි.*

### 8. Strategy

* **අරමුණ (Intent):** එකිනෙකට හුවමාරු කළ හැකි algorithms (ක්‍රමවේද) කාණ්ඩයක් නිර්මාණය කර, ධාවන කාලයේදී (at runtime) අවශ්‍ය algorithm එක තෝරාගැනීමට client ට ඉඩ දීම.
* **භාවිතය (Use Case):** Checkout එකකදී විවිධ ගෙවීම් ක්‍රම (Credit Card, PayPal) හෝ විවිධ sorting ක්‍රම (MergeSort, QuickSort) මාරුවෙන් මාරුවට භාවිතා කිරීම.

### 9. Chain of Responsibility

* **අරමුණ (Intent):** යම් ඉල්ලීමක් (request) එය භාරගත හැකි නිවැරදි කෙනෙකු හමුවන තුරු handlers දාමයක් (chain) ඔස්සේ ඉදිරියට යැවීම.
* **භාවිතය (Use Case):** ආයතනයක මිලදී ගැනීමේ ඉල්ලීමක් අනුමත කිරීමේදී (Approval workflow), එය Manager ගෙන් Director ටත්, ඉන්පසු CEO ටත් ආදී වශයෙන් දාමයක් ලෙස යැවීම.

### 10. Interpreter

* **අරමුණ (Intent):** යම් නිශ්චිත භාෂාවක හෝ ව්‍යාකරණයක (grammar) නීති හඳුනාගෙන, ඒවා තේරුම් ගෙන ක්‍රියාත්මක කිරීමට (evaluate) අර්ථකථනයක් (interpreter) සැපයීම.
* **භාවිතය (Use Case):** සරල SQL parser එකක්, ගණිතමය සමීකරණ විසඳන ක්‍රමවේදයක් (mathematical expression evaluator) හෝ අභිරුචි scripting භාෂාවක් නිර්මාණය කිරීම.

### 11. Mediator

* **අරමුණ (Intent):** Objects කිහිපයක් අතර ඍජුව සිදුවන සංකීර්ණ සන්නිවේදනයන් මධ්‍යගත (centralize) කර පාලනය කිරීම.
* **භාවිතය (Use Case):** ගුවන් තොටුපලක පාලක මැදිරිය (Air Traffic Control tower - Mediator) මගින් ගුවන් යානා අතර සන්නිවේදනය පාලනය කිරීම (මෙමගින් ගුවන් යානා එකිනෙකා ඍජුව කතා කිරීම වළක්වයි).

### 12. Memento

* **අරමුණ (Intent):** Object එකක encapsulation එක කඩ නොකර, එහි වත්මන් තත්ත්වය (state) සුරක්ෂිතව පිටතින් තබාගෙන, අවශ්‍ය වූ විට නැවත පෙර තිබූ තත්ත්වයට පත් කිරීම (restore).
* **භාවිතය (Use Case):** Text editor එකක "Undo/Redo" ක්‍රියාකාරීත්වය හෝ Video game එකක save-state පහසුකම ගොඩනැගීම.

### 13. Visitor

* **අරමුණ (Intent):** Object ව්‍යුහයක ඇති මූලද්‍රව්‍යවල (elements) classes වෙනස් නොකර, ඒවාට අලුත් ක්‍රියාකාරකම් (operations) එකතු කිරීමට ඉඩ සැලසීම.
* **භාවිතය (Use Case):** විවිධ Document nodes (Text, Image, Table) සහිත ව්‍යුහයක් වෙනස් නොකර, ඒ සඳහා අලුතින් `ExportToXML` වැනි ක්‍රියාකාරීත්වයක් එකතු කිරීම.

## මූලික සැලසුම් ප්‍රතිපත්ති (Design Principles)

මෙම රටාවන් අධ්‍යයනය කරන විට, පහත සඳහන් මූලික සැලසුම් ප්‍රතිපත්ති සැමවිටම මතකයේ තබාගන්න:

* **Favor Object Composition over Class Inheritance:** Subclasses ගොඩක් සාදනවා වෙනුවට objects එකිනෙක සම්බන්ධ කිරීම (wrappers සහ references) භාවිතා කරන්න. (උදා: Bridge සහ Decorator).
* **Open/Closed Principle:** Classes අලුත් දේවල් එකතු කිරීමට (extension) විවෘත විය යුතු අතර, පවතින කේතය වෙනස් කිරීමට (modification) වසා තිබිය යුතුය.
* **Program to an Interface, not an Implementation:** ධාවන කාලයේදී නම්‍යශීලීව වෙනස් වීම සඳහා සැමවිටම interfaces භාවිතා කරන්න (loose coupling).

> *"කේතයක් එක් වරක් ලිවීම අපහසු නොවේ. අපහසු වන්නේ එය ආරක්ෂිතව වෙනස් කිරීමයි." ("The challenge is not writing code once. The challenge is changing it safely.")*
