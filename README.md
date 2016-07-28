See [Deron Meranda's Data Page](http://deron.meranda.us/data/).

# 1990 US Census Data

2,500 most popular last names:

```java
usnames.Cencus.popularLastNames()
```

88,799 last names:

```java
usnames.Cencus.allLastNames()
```

4,275 female first names:

```java
usnames.Cencus.femaleFirstNames()
```

1,219 male first names:

```java
usnames.Cencus.maleFirstNames()
```

Results are `Iterator<String>` in upper case.

# Derived Data

5,163 all first names (both genders combined):

```java
usnames.Derived.allFirstNames()
```

60 unisex first names (used equally by males and females):

```java
usnames.Derived.unisexFirstNames()
```

304 names used as both first and last names:

```java
usnames.Derived.commonBothNames()
```

Results are `Iterator<String>` in upper case.

# Summary Data

316 common nicknames:

```java
usnames.Summary.nicknames()
```

1,780 most popular first names (covers 90% population):

```java
usnames.Summary.popularFirstNames()
```

4,760 most popular last names:

```java
usnames.Summary.popularLastNames()
```

1,055 most popular female first names:

```java
usnames.Summary.popularFemaleFirstNames()
```

791 most popular male first names:

```java
usnames.Summary.popularMaleFirstNames()
```

Results are `Iterator<String>` in upper case.

# Lookup nicknames

```java
usnames.Nickname.lookup("AGNES")     // => AGGY
usnames.Nickname.lookup("AGATHA")    // => AGGY
usnames.Nickname.lookup("ISABELLA")  // => BELLA
```

# Maven

* Group: tv.cntt
* Artifact: usnames
* Version: 1.0.0
