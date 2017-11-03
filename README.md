# android-room-test
This project is a sample to show android room error.

If we create the room immutable entity and room database in same module, annotation processor would generate right code.
Dao will use constructor with parameters, and it's OK.

When we separate the room immutable entity and room database (for example entity is located in library module and database in app module),
annotation processor would generate code not correct.
Dao will use default constructor and try to set value with setters, but the entity doesn't have them.

```java
      while (_cursor.moveToNext()) {
        final City _item;
        _item = new City();
        _item.getName = _cursor.getString(_cursorIndexOfName);
        _item.getLocation = _cursor.getString(_cursorIndexOfLocation);
        _result.add(_item);
      }

```