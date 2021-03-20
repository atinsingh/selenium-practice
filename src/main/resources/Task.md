## Learn All Locator type 

### ID 
One example of id is required 
```java
class HomeTest {
    @Test
    void tc() {
        driver.findElememt(By.id("any"));
    }
}
```

### Name 
One example of name
```java
class HomeTest {
    @Test
    void tc() {
        driver.findElememt(By.name("any"));
    }
}
```
### Class Name
use class name - one of the value from class attribute

```java
import org.openqa.selenium.By;

class HomeTest {
    @Test
    void tc() {
        driver.findElememt(By.className("any"));
    }
}
```
### Tag Name
Tag name is the name of HTML Tag 
```java
import org.openqa.selenium.By;

class HomeTest {
    @Test
    void tc() {
        driver.findElememt(By.tagName("a"));
    }
}
```
### CSS Selector 
CSS selector are like XPath, we can use to target the element 
```java
import org.openqa.selenium.By;

class HomeTest {
    @Test
    void tc() {
        driver.findElememt(By.cssSelector("#signupfree>.signupfree"));
    }
}
```

### LinkText
Matches the text on the link

```java

class HomeTest {
    @Test
    void tc() {
        driver.findElememt(By.linkText("SIGN UP, IT'S FREE"));
    }
}
```

### Partial LinkText
Its like searching String using contains method, which checks occurance of matched text

```java

class HomeTest {
    @Test
    void tc() {
        driver.findElememt(By.partialLinkText("IT'S FREE"));
    }
}
```

### XPATH

```java

class HomeTest {
    @Test
    void tc() {
        driver.findElememt(By.xpath("IT'S FREE"));
    }
}
```
You have search every kind of element 
```html
<div>I am div</div>
<ul>
    <li>Item</li>
    <li>Item</li>
</ul>

<select>
    <option>1</option>
    <option>2</option>
    <option>3</option>
</select>
<input type="text" /> 
<input type="radio">
<input type="checkbox">
```

Pop-ups / Iframes
### Double CLick, Drag and Drop 
