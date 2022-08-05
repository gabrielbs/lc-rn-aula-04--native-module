import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { Button, NativeModules, StyleSheet, Text, View } from 'react-native';

export default function App() {
  const [result, setResult] = React.useState('')

  return (
    <View style={styles.container}>
      <Button title="Chamar método nativo" onPress={() => {
        NativeModules?.LetsModule?.metodoManeiro("oie").then(setResult).catch(console.log)
      }} />
      <Text>Open up App.js to start working on your app!</Text>
      <Text>{JSON.stringify(result)}</Text>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
