package problem03

import "testing"

func TestSerializeDeserialize(t *testing.T) {
	node := &Node{
		Value: "root",
		Left: &Node{"left",
			&Node{"left.left", nil, nil}, nil},
		Right: &Node{"right", nil, nil},
	}

	serialized := Serialize(node)
	expected := "root,left,right,left.left,#,#,#,#,#"

	if serialized != expected {
		t.Errorf("Expected %s, got %s", expected, serialized)
	}

	deserialized := Deserialize(serialized)
	if deserialized.Left.Left.Value != "left.left" {
		t.Errorf("Expected left.left, got %s", deserialized.Left.Left.Value)
	}
}
